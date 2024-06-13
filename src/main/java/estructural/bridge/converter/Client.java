package estructural.bridge.converter;

import estructural.bridge.converter.converters.CSVConverter;
import estructural.bridge.converter.converters.Converter;
import estructural.bridge.converter.converters.JsonConverter;
import estructural.bridge.converter.employees.ITGuy;
import estructural.bridge.converter.employees.ProjectManager;

public class Client {

    public static void main(String[] args) {
	Converter csvConverter = new CSVConverter();
	Converter jsonConverter = new JsonConverter();

	ITGuy it = new ITGuy("Maurice Moss", 32, 4000d);
	ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);

	System.out.println(csvConverter.getEmployeeFormated(it));
	System.out.println(jsonConverter.getEmployeeFormated(it));
	System.out.println(csvConverter.getEmployeeFormated(pm));
	System.out.println(jsonConverter.getEmployeeFormated(pm));
    }
}