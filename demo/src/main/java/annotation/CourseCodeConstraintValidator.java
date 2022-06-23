package annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String prefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		prefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if (prefix != null)
			return value.startsWith(prefix);
		return false;
	}

}
