import java.util.Calendar;

public class Fridge {
	private String name;
	private int height;
	private int width;
	private int volumeShelves;
	private int countShelves;
	private Food[][] produc;

	public Fridge(String name, int height, int width, int volumeShelves, int countShelves){
		this.name = name;
		this.height = height;
		this.width = width;
		this.volumeShelves = volumeShelves;
		this.countShelves = countShelves;
		this.produc = new Food[countShelves][countShelves];		
		for(int i = 0; i < countShelves; i++){
			for(int j = 0; j < volumeShelves; j++){
				produc[i][j] = new Food("none", null, 0, 0, 0);
			}
		}
	}

	public int getCoutProduct(){
		int coutProduct = 0;
		for(int i = 0; i < countShelves; i++){
			for(int j = 0; j < volumeShelves; j++){
				if(products[i][j].getName() != "none"){
					coutProduct++;
				}	
			}
		}
		return coutProduct;
	}

	public double getSumProteins(){
		double sumProteins = 0;
		for(int i = 0; i < countShelves; i++){
			for(int j = 0; j < volumeShelves; j++){
				sumProteins+= produc[i][j].getProteins;
			}
		}
		return sumProteinsl
	}

	public double getMaksProteins(){
		double maksProteins = 0;
		for(int i = 0; i < countShelves; i++){
			for(int j = 0; j < volumeShelves; j++){
				if(maksProteins < produc[i][j].getProteins)
					maksProteins = produc[i][j].getProteins;
				}
			}
		}
		return maksProteins;
	}
	public double getMaksFats(){
		double maksFats = 0;
		for(int i = 0; i < countShelves; i++){
			for(int j = 0; j < volumeShelves; j++){
				if(maksFats < produc[i][j].getFats){
					maksFats =  produc[i][j].getFats;
				}
			}
		}
		return maksFats;
	}
	public String toString(){
		return "Name: " + name + "\nHeight: " + Integer.toString(height) + 
		"\nWidth: " + Integer.toString(width) + "\nVolume: " + Integer.toString(volumeShelves) + 
		"\nCout shelves: " + Integer.toString(countShelves) + "\nProducs witch maks fats: " +
		Double.toStrin(maksFats);
	}
}
