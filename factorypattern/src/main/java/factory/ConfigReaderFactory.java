package factory;

final public class ConfigReaderFactory {
    final private String imeDatoteke;

    public ConfigReaderFactory(String imeDatoteke){
        this.imeDatoteke = imeDatoteke;
    }

    public ConfigReader getConfigReader() throws Exception {
        if(imeDatoteke.toLowerCase().endsWith(".cnt")){
            return new TextConfigReader(imeDatoteke);
        }
        
        if(imeDatoteke.toLowerCase().endsWith("cnb")){
            return new BinaryConfigReader(imeDatoteke);
        }
        
        throw new Exception("Nije poznata ekstenzija config fajla.");
    }
}
