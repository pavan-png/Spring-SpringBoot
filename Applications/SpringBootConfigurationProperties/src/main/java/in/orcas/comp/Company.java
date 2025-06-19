package in.orcas.comp;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")
@ConfigurationProperties(prefix="org.orcas")
public class Company {

 private String name;
 private String type;
 private String location;

 static {
     System.out.println("Company.class file is loading...");
 }

 public Company() {
     System.out.println("Company Object is instantiated...");
 }

 //–– getters & setters ––//
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

 public String getLocation() {
     return location;
 }
 public void setLocation(String location) {
     this.location = location;
 }

 @Override
 public String toString() {
     return "Company{" +
            "name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", location='" + location + '\'' +
            '}';
 }
}
