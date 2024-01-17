package task3;

public class Registr {

    private Document[] documents = new Document[10];
    private int count = 0;

    public Document[] getDocuments() {
        return documents;
    }

    public void saveDoc(Document doc) {
        if(count < documents.length) {
            documents[count] = doc;
            count++;
        }
    }

    public void showInfo(Document document) {
        for (Document doc : documents) {
            if(doc != null && doc.equals(document)) {
                System.out.println(doc);
            }
        }
    }
}
