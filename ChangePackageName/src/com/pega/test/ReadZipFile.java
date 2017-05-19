package com.pega.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.pega.pad.pdm.Common.DBException;
import com.pega.pad.pdm.PersistentStore.IObjectStoreIterator;
import com.pega.pad.pdm.Util.ExceptionHelper;

public class ReadZipFile {
	final static String ZIP_FILE = "C:/Users/champ/Documents/My Received Files/Default.zip";
	static boolean flag = true;
	   /**
     * Name of the subdirectory for binary data of serialized objects.
     */
    private static final String BINARYDATADIR = "binarystore";


    /**
     * Name of the project subdirectory with all the tables in it. Each
     * table will be a separate file in this directory.
     */
    private static final String PROJECTTABLEDIR = "tables";


    /**
     * Name of the serialized project entry object.
     */
    private static final String SERIALIZEDPROJECTENTRYNAME = "entry.ser";


    /**
     * Name of the serialized array with the table definitions.
     */
    private static final String TABLEDEFINITIONS = "tabledefs.ser";

    /**
     * Possible separators when reading from a zip. Although we output only
     * forward slashes, export zip files have been observed that had backslashes,
     * probably due to manually construction. By allowing these, we add a little
     * more robustness.
     */
    private static final String separators[] = {"/", "\\"};

    /// The CSV separator for the data tables
    private static final String EXPORT_CSVSEPARATOR = ";";

    /// The CSV quote for the data tables
    private static final String EXPORT_CSVQUOTECHAR = "\"";

    /// The CSV header option for the data tables
    private static final boolean EXPORT_CSVFIRSTLINESPECIAL = true;

	static File file = new File(ZIP_FILE);
	
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream(file);
		ZipFile zipfile = new ZipFile(file);
		Enumeration entries1 = zipfile.entries();
		 while(entries1.hasMoreElements()) {
	            ZipEntry entry = (ZipEntry)entries1.nextElement();
//	            System.out.println(entry.getName());
//	            System.out.println(entry.getClass());
	        }
//		System.out.println("*");
		IObjectStoreIterator entries = getObjectStoreIterator(35, zipfile);
		while (entries.next()) {
			System.out.println("*+**+1");
			try{
				InputStream in = entries.getBinaryStream();
				MyObjectInputStream ois = new MyObjectInputStream(in);
				Object o = ois.readObject();
				System.out.println(o.getClass());
				}catch(Throwable e){
					e.printStackTrace();
					String msg = e.getMessage();
					String msg1 = msg.replace("com.kiq.omega","com.pega.pad");
					System.err.println(" res.put(\""+ msg+"\","+ msg1+".class);");
//					e.printStackTrace();
				}
		}
		
	}
	
	public void writeObjectToFile(Object OProject){
		
	}
	
//	public static void getzipentries(){
//		ZipEntry entry = (ZipEntry) entries.nextElement();
//		if( flag ){
//			try{
//			InputStream in = zipfile.getInputStream(entry);
//			MyObjectInputStream ois = new MyObjectInputStream(in);
//			Object o = ois.readObject();
//			System.out.println(o.getClass());
//			}catch(Throwable e){
//				System.err.println(e.getMessage());
//			}
//		}
//		
//	}
	 public static IObjectStoreIterator getObjectStoreIterator(long id,ZipFile sourceZip) throws DBException /*, DataFormatException*/ {

	        final int prefixLength = 2 + (id + BINARYDATADIR).length();

	        final ZipFile selectedZip = sourceZip;
	        final List selectedEntries = new ArrayList();
	        Enumeration entries = sourceZip.entries();
	        while(entries.hasMoreElements()) {
	            ZipEntry entry = (ZipEntry)entries.nextElement();
	            for (int sepIdx=0; sepIdx<separators.length; sepIdx++) {
	                String prefix = id + separators[sepIdx] + BINARYDATADIR + separators[sepIdx];
	                if(entry.getName().startsWith(prefix)) {
	                    selectedEntries.add(entry);
	                }
	            }
	        }

	        return new IObjectStoreIterator()
	        {

	            private int currentIndex = 0;

	            private ZipEntry currentEntry = null;

	            public void close() {

	            }

	            public String getKey() {
	                String name = currentEntry.getName();
	                return name.substring(prefixLength);
	            }

	            public int getLength() {
	                return (int)currentEntry.getSize();
	            }

	            public boolean next() {
	                if(currentIndex < selectedEntries.size()) {
	                    currentEntry = (ZipEntry)selectedEntries.get(currentIndex);
	                    currentIndex++;
	                }
	                else {
	                    currentEntry = null;
	                }
	                return currentEntry != null;
	            }

	            public InputStream getBinaryStream() throws DBException {
	                try {
	                    return selectedZip.getInputStream(currentEntry);
	                }
	                catch(IOException e) {
	                    ExceptionHelper.raiseDBException(e);
	                }
	                return null; // never reached
	            }
	        };
	    }

}
