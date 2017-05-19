package com.pega.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class MyObjectInputStream extends ObjectInputStream{
    public static Map<String, Class> classNameMapping = initclassNameMapping();

    public MyObjectInputStream() throws IOException, SecurityException {
        super();
    }

    
    public MyObjectInputStream(InputStream in) throws IOException, SecurityException {
        super(in);
    }
    
    
    private static Map<String, Class> initclassNameMapping(){
        Map<String, Class> res = new HashMap<String, Class>();
        
        res.put("com.kiq.omega.util.csv.CSVOptions",com.pega.decision.ode.util.csv.CSVOptions.class);
        res.put("com.kiq.omega.util.ConnectionException",com.pega.decision.ode.util.ConnectionException.class);
        res.put("com.kiq.omega.pdm.ProjectManagement.PMEntry",com.pega.pad.pdm.ProjectManagement.PMEntry.class);
//        res.put("com.kiq.omega.pdm.ProjectManagement._IProjectEntryImplBase",com.pega.pad.pdm.ProjectManagement._IProjectEntryImplBase.class);
        res.put("com.kiq.omega.pdm.PersistentStore.TableDefinition",com.pega.pad.pdm.PersistentStore.TableDefinition.class);
        res.put("com.kiq.omega.pdm.PersistentStore.ColumnDefinition",com.pega.pad.pdm.PersistentStore.ColumnDefinition.class);
        res.put("com.kiq.omega.pdm.PersistentStore.TableDefinition",com.pega.pad.pdm.PersistentStore.TableDefinition.class);
        res.put("com.kiq.omega.pdm.ProjectManagement.ProjectEntry",com.pega.pad.pdm.ProjectManagement.ProjectEntry.class);
        res.put("com.kiq.omega.pdm.PersistentStore.ColumnDefinition",com.pega.pad.pdm.PersistentStore.ColumnDefinition.class);
//        res.put("com.kiq.omega.pdm.common._INamedEntityImplBase",com.pega.pad.pdm.Common._INamedEntityImplBase.class);
//        res.put("com.kiq.omega.pdm.ProjectManagement._IProjectDirectoryImplBase",com.pega.pad.pdm.ProjectManagement._IProjectDirectoryImplBase.class);
        res.put("com.kiq.omega.pdm.ProjectManagement.ProjectDirectory",com.pega.pad.pdm.ProjectManagement.ProjectDirectory.class);
        res.put("com.kiq.omega.pdm.Project.OProject",com.pega.pad.pdm.Project.OProject.class);
        res.put("com.kiq.omega.pdm.PersistentStore.ColumnDefinition",com.pega.pad.pdm.PersistentStore.ColumnDefinition.class);
        res.put("com.kiq.omega.pdm.Project.BootstrapSettings",com.pega.pad.pdm.Project.BootstrapSettings.class);
        res.put("com.kiq.omega.pdm.PersistentStore.ColumnDefinition",com.pega.pad.pdm.PersistentStore.ColumnDefinition.class);
        res.put("com.kiq.omega.pdm.Project.BusinessObjectiveSettings",com.pega.pad.pdm.Project.BusinessObjectiveSettings.class);
        res.put("com.kiq.omega.pdm.Common.TColumnEvaluatorType",com.pega.pad.pdm.Common.TColumnEvaluatorType.class);
        res.put("com.kiq.omega.pdm.GA.GASettings",com.pega.pad.pdm.GA.GASettings.class);
        res.put("com.kiq.omega.pdm.GA.TGeneticAlgorithmType",com.pega.pad.pdm.GA.TGeneticAlgorithmType.class);
        res.put("com.kiq.omega.pdm.GA.TEngineeringType",com.pega.pad.pdm.GA.TEngineeringType.class);
        res.put("com.kiq.omega.pdm.common.NamedEntity",com.pega.pad.pdm.Common.NamedEntity.class);
        res.put("com.kiq.omega.pdm.Common.NamedEntity",com.pega.pad.pdm.Common.NamedEntity.class);
        res.put("com.kiq.omega.pdm.GA.TFitnessScalingMethod",com.pega.pad.pdm.GA.TFitnessScalingMethod.class);
        res.put("com.kiq.omega.pdm.GA.TFitnessScalingMethod",com.pega.pad.pdm.GA.TFitnessScalingMethod.class);
        res.put("com.kiq.omega.pdm.GA.TGenomeSelectionMethod",com.pega.pad.pdm.GA.TGenomeSelectionMethod.class);
        res.put("com.kiq.omega.pdm.GA.TTreeType",com.pega.pad.pdm.GA.TTreeType.class);
        res.put("com.kiq.omega.pdm.Project.DataSettings",com.pega.pad.pdm.Project.DataSettings.class);
        res.put("com.kiq.omega.pdm.GA.GASettingsList",com.pega.pad.pdm.GA.GASettingsList.class);
        res.put("com.kiq.omega.pdm.Project.PredictorGroupingSettings",com.pega.pad.pdm.Project.PredictorGroupingSettings.class);
        res.put("com.kiq.omega.pdm.Common.ProgressReporter",com.pega.pad.pdm.Common.ProgressReporter.class);
        res.put("com.kiq.omega.pdm.Common.IProgressReporterPackage.TTaskType",com.pega.pad.pdm.Common.IProgressReporterPackage.TTaskType.class);
        res.put("com.kiq.omega.pdm.Common.HierarchicalDictionary",com.pega.pad.pdm.Common.HierarchicalDictionary.class);
        res.put("com.kiq.omega.pdm.DataManagement.SampleSettings",com.pega.pad.pdm.DataManagement.SampleSettings.class);
        res.put("com.kiq.omega.pdm.Project.ScoreDistributionSettings",com.pega.pad.pdm.Project.ScoreDistributionSettings.class);
        res.put("com.kiq.omega.pdm.Common.TScoreBandType",com.pega.pad.pdm.Common.TScoreBandType.class);
        res.put("com.kiq.omega.pdm.Project.TargetSettings",com.pega.pad.pdm.Project.TargetSettings.class);
        res.put("com.kiq.omega.pdm.Common.TTargetType",com.pega.pad.pdm.Common.TTargetType.class);
        res.put("com.kiq.omega.pdm.TransformationManagement.TransformationFactory",com.pega.pad.pdm.TransformationManagement.TransformationFactory.class); 
        res.put("com.kiq.omega.pdm.TransformationManagement.PDASettings",com.pega.pad.pdm.TransformationManagement.PDASettings.class);
        res.put("com.kiq.omega.pdm.Util.UpCounter",com.pega.pad.pdm.Util.UpCounter.class);
       
        
        
        return Collections.unmodifiableMap(res);
    }
    
    @Override
    protected java.io.ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        ObjectStreamClass desc = super.readClassDescriptor();
        System.out.println(desc.getClass().getCanonicalName());
        for (final String oldName : classNameMapping.keySet())
        {
            if (desc.getName().equals(oldName))
            {
                String replacement = classNameMapping.get(oldName).getName();
                System.out.println("$$$$$$$$$$$$"+replacement);
                try
                {
                    Field f = desc.getClass().getDeclaredField("name");
                    f.setAccessible(true);
                    f.set(desc, replacement);
                    return desc;
                }
                catch (Exception e)
                {
                	System.out.println("******************************************");
                	e.printStackTrace();
                   System.out.println("Error while replacing class name." + e.getMessage());
                }
            }
        }
       return desc;
    }
}

