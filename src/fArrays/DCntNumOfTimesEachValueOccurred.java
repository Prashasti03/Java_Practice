package fArrays;

public class DCntNumOfTimesEachValueOccurred {

	public static void main(String[] args) {
		
		int a[] = {22, 55, 22, 66, 77, 55};
		for(int i=0;i<a.length;i++) {
			boolean alreadyCounted = false;
		    for (int k = 0; k < i; k++) {

		        if (a[i] == a[k]) {
		            alreadyCounted = true;
		            break;
		        }
		    }
		    if (alreadyCounted) {
		        continue;
		    }
			int count = 0;
			for(int j=0; j<a.length; j++) {
				if(a[j]==a[i]) {
					count++;
				}
			}
			System.out.println(a[i] + " - " + count);
		}

	}

}

//Dry run

//i        i<6         alreadyCounted           k         k<i          a[i] == a[k]         count          j          j<6          a[j]==a[i]
//0        0<6 t            f                   0         0<0 f             -                0             0          0<6 t         22 == 22 t -> count = 1
//1        1<6 t            f                   1         1<1 f             -                1             1          1<6 t         55 == 55 t -> count = 2
//2        2<6 t            f                   2         2<2 f             -                