package loose.oose.fis.documents;

import java.util.Arrays;

public class XML extends Document {
    public XML(String[] continut) {
        super(continut);
    }

    @Override
    public String[] analizeaza() {
        String[] res = new String[content.length];
        int      pos = 0;

        for (String cuvant : content) {
            if (cuvant.charAt(0) != '<' || cuvant.charAt(cuvant.length() - 1) != '>') {
                res[pos] = cuvant;
                pos++;
            }
        }

        return Arrays.copyOf(res, pos);
    }

    @Override
    public String toString() {
        return "XML " + super.toString();
    }
}
