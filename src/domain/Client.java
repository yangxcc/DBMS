package domain;

public class Client {
    /*
    * CREATE TABLE `client` (
  `client_id` int(11) NOT NULL,
  `cn_name` varchar(255) DEFAULT NULL,
  `en_name` varchar(255) DEFAULT NULL,
  `short_name` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `zone` varchar(255) DEFAULT NULL,
  `principal` varchar(255) DEFAULT NULL,
  `principal_tel` varchar(255) DEFAULT NULL,
  `principal_addr` varchar(255) DEFAULT NULL,
  `principal_email` varchar(255) DEFAULT NULL,
  `postcode` varchar(255) DEFAULT NULL,
  `bank_account` varchar(255) DEFAULT NULL,
  `account_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
    private int client_id;
    private String cn_name;
    private String en_name;
    private String short_name;
    private String province;
    private String city;
    private String zone;
    private String principal;
    private String principal_tel;
    private String principal_addr;
    private String principal_email;
    private String postcode;
    private String bank_account;
    private String account_number;

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getCn_name() {
        return cn_name;
    }

    public void setCn_name(String cn_name) {
        this.cn_name = cn_name;
    }

    public String getEn_name() {
        return en_name;
    }

    public void setEn_name(String en_name) {
        this.en_name = en_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPrincipal_tel() {
        return principal_tel;
    }

    public void setPrincipal_tel(String principal_tel) {
        this.principal_tel = principal_tel;
    }

    public String getPrincipal_addr() {
        return principal_addr;
    }

    public void setPrincipal_addr(String principal_addr) {
        this.principal_addr = principal_addr;
    }

    public String getPrincipal_email() {
        return principal_email;
    }

    public void setPrincipal_email(String principal_email) {
        this.principal_email = principal_email;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
}
