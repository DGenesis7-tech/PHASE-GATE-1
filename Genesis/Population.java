public class Population{
public static void main(String[] args){

double estimatedPopulation = 8250423613L;
// Growth rate by 1.26% 
double growtRate = 1.26;
double growthPopulation;
System.out.println("Year\tAnticipated world poulation\t\tnumerical increase");
for (int year = 1; year <= 75; year++){
growthPopulation = ((1.26 / 100) * estimatedPopulation);
estimatedPopulation += growthPopulation ;
System.out.printf("%d\t%.0f\t%.0f%n", year, estimatedPopulation, growthPopulation);

if (estimatedPopulation > (estimatedPopulation)*2){
System.out.println("year when the estimated population" + year);
}
}

}

}