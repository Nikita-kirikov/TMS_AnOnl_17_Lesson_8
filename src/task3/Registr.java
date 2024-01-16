package task3;

public class Registr {

    private Document[] documents = new Document[10];

    public Document[] getDocuments() {
        return documents;
    }

    public void saveDoc(Document doc) {
        for (int i = 0; i < documents.length; i++) {
                if (documents[i] == null) {
                    documents[i] = doc;
                    break;
                }
        }
    }

    public void showInfo(Document doc) {
        System.out.println(doc.toString());
    }
}
