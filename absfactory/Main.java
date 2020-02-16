import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Data data = new Data();
		
		List<DocumentComponentBase> wordDocument = createDocument(new WordDocumentFactory(), data);
		
		List<DocumentComponentBase> excelDocument = createDocument(new ExcelDocumentFactory(), data);
	}
	
	private static List<DocumentComponentBase> createDocument(DocumentMakerFactoryBase factory, Data data)
	{
		List<DocumentComponentBase> result = new ArrayList<>();
		
		result.add(factory.createCaption(data));
		result.add(factory.createBody(data));
		result.add(factory.createGraphics(data));
		result.add(factory.createFooter(data));
		
		return result;
	}

}
