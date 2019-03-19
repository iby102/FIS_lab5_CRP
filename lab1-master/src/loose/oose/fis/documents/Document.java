package loose.oose.fis.documents;

public abstract class Document {
    protected String[] content;

    public Document(String[] content) {
        this.content = content;
    }

    public abstract String[] analizeaza();

    @Override

    public String toString() {
        String res = "";
        for (String cuvant : content) {
            res += cuvant + " ";
        }
        return res;
    }
}
