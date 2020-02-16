
public class ExcelDocumentFactory extends DocumentMakerFactoryBase {

	@Override
	public DocumentCaptionBase createCaption(Data data) {
		return new ExcelCaption();
	}

	@Override
	public DocumentBodyBase createBody(Data data) {
		return new ExcelBody();
	}

	@Override
	public DocumentFooterBase createFooter(Data data) {
		return new ExcelFooter();
	}

	@Override
	public DocumentGraphicsBase createGraphics(Data data) {
		return new ExcelGraphics();
	}

}
