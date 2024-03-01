https://docs.google.com/spreadsheets/d/1WNkqQl60OggHLdyWgjhSs_x7qs3cAXNLNXy9jsqR1Qc/edit#gid=0  << here is the link to google spreadsheet for my chart

I have created a chart based on the N which is the number of entries in your list being sorted vs the time it takes to run the method in milliseconds. 
Since my dataset size was 572, I used 5 testing points for N:100, 200, 300, 400, 500. And for each testing point I got the runtime of 3,5,8,13,17 in ms.
Plotting this data in gragh, I learned that the relationship between the runtime and size of N was not a linear relationship. The x and y variable which is N and time seemed to be a quadratic relationship. 
As I increased the size of of N, the increase rate for my time got bigger and bigger. This showed that the time complexity of my sort() method was not linear. 
Considering the worst case of my sort() method where the outer loop iterates all the way up to size()-1 times and also the inner loop iterate the same amount to have a sort list, the time complexity of the method
will be square of the size of the arrayList which means that the time complexity is o(N^2). I think this correlates to the graph I made where it didn't seem to have a linear relationship, rather quadratic. 


