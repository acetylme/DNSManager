public class Record {
    public String domain;
    public String type;
    public String name;
    public String value;

    public Record(String domian, String type,String name, String value)
    {
        this.domain = domian;
        this.type = type;
        this.name = name;
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        return new Record(domain,type,name,value);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DOMAIN: " + domain +"\t");
        builder.append("TYPE: " + type + "\t");
        builder.append("NAME: " + name + "\t");
        builder.append("VALUE: " + value + "\n");

        return builder.toString();
    }
}
