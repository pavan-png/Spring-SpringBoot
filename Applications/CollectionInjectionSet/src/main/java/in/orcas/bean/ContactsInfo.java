package in.orcas.bean;

import java.time.LocalDate;
import java.util.Set;

public class ContactsInfo {
    private Set<Long> phoneNumbers;
    private Set<LocalDate> dates;

    public ContactsInfo(Set<Long> phoneNumbers, Set<LocalDate> dates) {
        System.out.println("Parameterized constructor got called...");
        this.phoneNumbers = phoneNumbers;
        this.dates = dates;
        System.out.println(phoneNumbers.getClass());
    }

    @Override
    public String toString() {
        return "ContactsInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
    }
}
