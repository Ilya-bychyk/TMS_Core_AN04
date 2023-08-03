package Lesson5.staticExamples;

public class Phone {
    private String code;
    private String number;

    // code = +375, number = 251231212
    private Phone(String code, String number) {
        this.code = code;
        this.number = number;
    }

    // +375 251231212
    public Phone(String fullNumber) {
        this(fullNumber.substring(0, 4), fullNumber.substring(4));
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }

    public String getFullNumber() {
        return code + number;
    }
}
