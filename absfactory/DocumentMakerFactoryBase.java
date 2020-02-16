
public abstract class DocumentMakerFactoryBase {
	
	public abstract DocumentCaptionBase createCaption(Data data);
	
	public abstract DocumentBodyBase createBody(Data data);
	
	public abstract DocumentFooterBase createFooter(Data data);
	
	public abstract DocumentGraphicsBase createGraphics(Data data);

}
