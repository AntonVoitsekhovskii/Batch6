
public class Artifact {
			
			int number;
			String culture;
			int century;
			
			public Artifact(int number, String culture, int century) {
				this.number = number;
				this.culture = culture;
				this.century = century;
			}
			
			public Artifact(int number, String culture) {
				this.number = number;
				this.culture = culture;
			}
			
			public Artifact(int number) {
				this.number = number;
				
			}
			public static void main(String[] args) {
				Artifact vase = new Artifact(2110, "Greek", 12);
				Artifact arrow = new Artifact(2111);
				Artifact plate = new Artifact(2112, "Aztek");
				//System.out.println("Added new Artifact with number: " + vase.number);
				//System.out.println("Culture is: " + vase.culture);
				//System.out.println("The century is: " + vase.century);
				
				
			
				
			}
}
