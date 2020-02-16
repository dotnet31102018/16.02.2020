
public class WordDocumentFactory extends DocumentMakerFactoryBase {

	@Override
	public DocumentCaptionBase createCaption(Data data) {
		return new WordCaption();
	}

	@Override
	public DocumentBodyBase createBody(Data data) {
		return new WordBody();
	}

	@Override
	public DocumentFooterBase createFooter(Data data) {
		return new WordFooter();
	}

	@Override
	public DocumentGraphicsBase createGraphics(Data data) {
		return new WordGraphics();
	}

}
