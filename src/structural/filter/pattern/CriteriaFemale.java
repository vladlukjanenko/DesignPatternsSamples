/**
 * 
 */
package structural.filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vlad Lukjanenko
 *
 */
public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();

		for (Person p : persons) {
			if (p.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(p);
			}
		}

		return femalePersons;
	}

}
