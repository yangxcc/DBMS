package domain;

public class Goods {
    /*
    *
    * CREATE TABLE `goods` (
  `goods_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `package` varchar(255) DEFAULT NULL,
  `measurement` varchar(255) DEFAULT NULL,
  `unit_length` double DEFAULT NULL,
  `unit_width` double DEFAULT NULL,
  `unit_height` double DEFAULT NULL,
  `unit_weigth` double(255,0) DEFAULT NULL,
  `preservation_temperature` double(255,0) DEFAULT NULL,
  `expiry_date` double DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/

    private int goods_id;
    private String name;
    private String type;
    private String package_method;
    private String measurement;
    private double unit_length;
    private double unit_width;
    private double unit_height;
    private double unit_weight;
    private double preservation_temperature;
    private double expiry_date;

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPackage_method() {
        return package_method;
    }

    public void setPackage_method(String package_method) {
        this.package_method = package_method;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public double getUnit_length() {
        return unit_length;
    }

    public void setUnit_length(double unit_length) {
        this.unit_length = unit_length;
    }

    public double getUnit_width() {
        return unit_width;
    }

    public void setUnit_width(double unit_width) {
        this.unit_width = unit_width;
    }

    public double getUnit_height() {
        return unit_height;
    }

    public void setUnit_height(double unit_height) {
        this.unit_height = unit_height;
    }

    public double getUnit_weight() {
        return unit_weight;
    }

    public void setUnit_weight(double unit_weight) {
        this.unit_weight = unit_weight;
    }

    public double getPreservation_temperature() {
        return preservation_temperature;
    }

    public void setPreservation_temperature(double preservation_temperature) {
        this.preservation_temperature = preservation_temperature;
    }

    public double getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(double expiry_date) {
        this.expiry_date = expiry_date;
    }
}
