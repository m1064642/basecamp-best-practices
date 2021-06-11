

public class GFG{
	
// Implements above mentioned steps.
static int maxGroup(int n, int m)
{
	if (n >= 2 * m)
		return n;
	if (m >= 2 * n)
		return m;
	if ((m + n) % 3 == 0)
		return (m + n) / 3;

	int ans = (m + n) / 3;
	m %= 3;
	n %= 3;

	if (m > 0 && n > 0 && (m + n) >= 3)
		ans++;

	return ans;
}

	// Driver code
	static public void main (String[] args)
	{
			int n = 4, m = 5;
	System.out.println(maxGroup(1, 2));
	}
}

// This code is contributed by vt_m.
