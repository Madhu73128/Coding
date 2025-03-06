class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost)
     {
        // If start at i, fill tack with gas[i] and subtract cost[i] (i.e. 
        // leave i-th station for the (i+1)-th station).

        int[] netCost = new int[cost.length];
        int[] accCost = new int[cost.length];
        int minAccCostIndex = 0;

        for (int i = 0; i < gas.length; i++)
        {
            netCost[i] = gas[i] - cost[i];
            accCost[i] = i == 0 ? netCost[i] : netCost[i] + accCost[i - 1];
            if (accCost[i] < 0 && accCost[i] < accCost[minAccCostIndex]) {
                minAccCostIndex = i;
            }
        }
        
        if (accCost[cost.length - 1] < 0)
            return -1;
        else if (accCost[minAccCostIndex] >= 0)
            return 0; // all values of accumulative costs are positive. Start at the first station.

        // minAccCostIndex can't be the last element.
        // Otherwise, there wouldn't be a valid solution. 
        return minAccCostIndex + 1; 
    }
}