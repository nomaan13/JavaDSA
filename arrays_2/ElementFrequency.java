package arrays;

public class ElementFrequency {

	public void countFrequencyOfElement(int a[]) {
		int n = a.length-1;

		for (int i = 0; i <= n; i++) {
			int count = 1;
			for (int j = i + 1; j <= n; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = a[n];
					j--;
					n--;

				}

			}
			System.out.println(a[i] + " appears " + count + " times.");
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 1, 2, 3, 41, 21, 2, 2, 4, 5 };

		ElementFrequency e1 = new ElementFrequency();
		e1.countFrequencyOfElement(a);
	}

}
