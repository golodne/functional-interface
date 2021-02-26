package ru.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        List<Mapping> mappings = Arrays.asList(new Mapping("pcb_val1", "mdm_val1"), new Mapping("pcb_val2", "mdm_val2"));

        BiPredicate<Mapping, String> predicateMdm = (mapping, value) -> value.equals(mapping.mdm_value);
        BiPredicate<Mapping, String> predicatePcb = (mapping, value) -> value.equals(mapping.pcb_value);

        String findValue = "mdm_val1";
        String result = convert(predicateMdm, Mapping::getPcb_value, mappings,findValue);
        System.out.println(result);

        String findValue2 = "pcb_val2";
        String result2 = convert(predicatePcb, Mapping::getMdm_value, mappings,findValue2);
        System.out.println(result2);
    }

    public static String convert(BiPredicate<Mapping, String> predicate, Function<Mapping,String> func, List<Mapping> mappings, String findValue) {
        return mappings.stream()
                .filter(mapping -> predicate.test(mapping,findValue))
                .findAny()
                .map(func::apply)
                .orElse(null);
    }
}

class Mapping {
    public String pcb_value;
    public String mdm_value;

    public Mapping(String pcb_value, String mdm_value) {
        this.pcb_value = pcb_value;
        this.mdm_value = mdm_value;
    }

    public String getPcb_value() {
        return pcb_value;
    }

    public void setPcb_value(String pcb_value) {
        this.pcb_value = pcb_value;
    }

    public String getMdm_value() {
        return mdm_value;
    }

    public void setMdm_value(String mdm_value) {
        this.mdm_value = mdm_value;
    }
}

