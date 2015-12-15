public class Solution {

        public static void main(String[] args){
            
            Class student =new Student().getClass();
            Method[] methods =student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method x:methods){
                methodList.add(x.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
            
        }

    }