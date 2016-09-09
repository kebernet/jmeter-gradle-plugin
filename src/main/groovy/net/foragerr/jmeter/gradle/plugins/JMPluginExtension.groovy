package net.foragerr.jmeter.gradle.plugins

class JMPluginExtension {

    File jmLog = null           //maps to -j, --jmeterlogfile
    File testFileDir = null
    File jmPropertyFile = null  //maps to -p, --propfile
    File jmAddProp = null       //maps to -q, --addprop
    File customReportXslt
    File logfile = null         //maps to -l, --logfile

    Boolean ignoreErrors = null
    Boolean ignoreFailures = null
    Boolean remote = false
    Boolean enableReports = null
    Boolean enableExtendedReports = null
    Boolean failBuildOnError = null

    List<File> jmTestFiles = null             //maps to -t, --testfile
    List<File> jmSystemPropertiesFiles = null //maps to -S, --systemPropertyFile

    List<String> jmSystemProperties = null    //maps to -D, --systemproperty
    List<String> jmPluginJars = null
    List<String> jmUserProperties = null      //maps to -J, --jmeterproperty
    List<String> includes = null
    List<String> excludes = null

    String reportPostfix
    String reportXslt = null
    String maxHeapSize
    String minHeapSize
    String reportTitle = null

    //For internal use, Not user settable:
    String jmVersion
    String jmPluginVersion

    File workDir = null
    File reportDir = null
    List<File> jmResultFiles = null

}
