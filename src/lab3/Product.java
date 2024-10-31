package lab3;

class Product {

    private String nameotdela;
    private long productCode;
    private String name;
    private String cuntry;
    private int retailPrice;
    private String namesource;

    public Product(String nameotdela, long productCode, String name, String cuntry, int retailPrice, String namesource) {
        this.nameotdela = nameotdela;
        this.productCode = productCode;
        this.name = name;
        this.cuntry = cuntry;
        this.retailPrice = retailPrice;
        this.namesource = namesource;
    }

    public String getNameotdela() {
        return nameotdela;
    }

    public void setNameotdela(String nameotdela) {
        this.nameotdela = nameotdela;
    }

    public long getProductCode() {
        return productCode;
    }

    public void setProductCode(long productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuntry() {
        return cuntry;
    }

    public void setCuntry(String cuntry) {
        this.cuntry = cuntry;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getNamesource() {
        return namesource;
    }

    public void setNamesource(String namesource) {
        this.namesource = namesource;
    }
}