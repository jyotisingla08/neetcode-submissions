class Solution {
    public boolean isAnagram(String s, String t) {
         
         HashMap<Character, Integer> hm = new HashMap<>();

         for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }

            else {
                hm.put(ch,1);
            }
         }



         for(int i=0; i<t.length(); i++){

            char ch = t.charAt(i);

            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
            }

            else {
               return false;
            }
         }


        for (Map.Entry<Character,Integer> mapElement : hm.entrySet()) {
            //String key = mapElement.getKey();

            // Adding some bonus marks to all the students
            int value = (mapElement.getValue());

            if(value!=0)
            return false;
        }


        return true;


    }
}
