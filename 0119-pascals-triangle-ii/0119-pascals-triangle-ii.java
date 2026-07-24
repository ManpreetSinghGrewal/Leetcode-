class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> row = new ArrayList<>();

        row.add(1);

        for(int i=1; i<= rowIndex; i++){

            for(int j=row.size()-1; j>=1; j--){

                row.set(j, row.get(j) + row.get(j-1));

                //start addition from right to left
                //we are not creating new list everytime, we are overwriting the numbers after adding on the same list for every new row, so we have to take care that we don't overwrite numbers before we are finished using them

            }

        row.add(1);
        }

        return row;
    }
}