import java.util.ArrayList;
public class GitHubPractice{

	public static ArrayList combineLists(ArrayList<Integer> list1, ArrayList<Integer> list2){

		ArrayList<Integer> combination = new ArrayList<>();

		for(int i = 0; i<list1.size(); i++){
			combination.add(list1.get(i));
		}

		for(int i = 0; i<list2.size(); i++){
			combination.add(list2.get(i));
		}

		return combination;

	}

	public static void printList(ArrayList<Integer> list){

		for(int i = 0; i<list.size()-1; i++){
				System.out.print(list.get(i)+", ");
		}
		System.out.println(list.get(list.size()-1));

	}

	public static ArrayList removeDuplicates(ArrayList<Integer> list){

		for(int i = 0; i<list.size(); i++){
			for(int j = list.size(); j<list.size(); j++){
				if(list.get(i) == list.get(j))
					list.remove(i);
			}
		}
		return list;
	}

	public static void main(String[]args){

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i = 0; i<10; i++){
			int random1 = (int)(Math.random()*10)+1;
			int random2 = (int)(Math.random()*10)+1;
			list1.add(random1);
			list2.add(random2);
		}

		System.out.println(combineLists(list1, list2));

		printList(list1);

		System.out.println(list1);

		System.out.println(removeDuplicates(list1));
	}
}