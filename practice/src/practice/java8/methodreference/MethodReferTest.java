package practice.java8.methodreference;

import java.util.function.Supplier;

/**
 * 方法引用是和lambda表达式配合使用的，目前看起来就是将方法作为参数传递，实现方法的复用；
 * @author jefferyqjy
 *
 */
public class MethodReferTest {
	public static void main(String[] args) {
		PersonFactory factory = new PersonFactory(Person :: new);
		System.out.println(factory);
	}
	
	static class Person {
        private String name;

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }

        public int compareTo(Person p) {
            return this.getName().compareTo(p.getName());
        }
    }
	
	static class PersonFactory {
		private Supplier<Person> supplier;

		public PersonFactory(Supplier<Person> supplier) {
			this.supplier = supplier;
		}

		public Supplier<Person> getSupplier() {
			return supplier;
		}

		public void setSupplier(Supplier<Person> supplier) {
			this.supplier = supplier;
		}
		
	}
}
