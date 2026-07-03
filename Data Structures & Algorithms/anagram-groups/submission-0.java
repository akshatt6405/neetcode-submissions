class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        ArrayList <ArrayList<String>> ans=new ArrayList<>();
        HashMap <String,List<String>> map=new HashMap<>();
        String[] ans2=new String[strs.length];

        for(int i=0;i<strs.length;i++){
         char []chars=strs[i].toCharArray();
          Arrays.sort(chars);
             ans2[i]=new String(chars);

        }

        for(int i=0;i<ans2.length;i++){
            String key=ans2[i];
            String orignal=strs[i];

            if(map.containsKey(key)){
                map.get(key).add(orignal);
            }else{
                List<String> list = new ArrayList<>();
                list.add(orignal);
                map.put(key, list);
            }
            
        }

        return new ArrayList<>(map.values());

    }
}
