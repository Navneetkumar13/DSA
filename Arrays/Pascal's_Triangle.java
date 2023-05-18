// Pascal's Triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        q.add(1);
        res.add(q);
        for(int i=0;i<numRows-1;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            for(int j=0; j<res.get(res.size()-1).size() ; j++){
                temp.add(res.get(res.size()-1).get(j));
            }
            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for(int k=0; k<=res.get(res.size()-1).size(); k++){
                row.add(temp.get(k) + temp.get(k+1));
            }
            res.add(row);
        }
        return res;

        /*
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        q.add(1);
        res.add(new ArrayList(q));
        for(int i=0;i<numRows-1;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            for(int k=0;k<res.get(res.size()-1).size();k++){
                temp.add(res.get(res.size()-1).get(k));
            }
            //temp.add(new ArrayList(res.get(res.size()-1)));
            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<res.get(res.size()-1).size()+1;j++){
                row.add(temp.get(j)+temp.get(j+1));
            }
            res.add(new ArrayList(row));
        }
        //System.out.println(res);
        return res;
        */
    }
}