# Find-the-Celebrity

Explanation:
Step 1: Identify a Candidate
Use a loop to find a potential celebrity. If knows(celebrity, i) is true, then celebrity cannot be the celebrity (since they know someone else), so set celebrity = i.

Step 2: Verify the Candidate
Check the two conditions for the celebrity:

Everyone else must know the candidate.
The candidate must not know anyone else.
Output: If the candidate passes both checks, they are the celebrity. Otherwise, return -1.

