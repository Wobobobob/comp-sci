public class Utils {
    public Utils(){}
    Hub hub = new Hub();
    Student gob = new Student("gob", "mr.gobby", "gob@gmail.com");

    public void testLoginStudent(){

        
        
        try{
            hub.loginStudent("bob", "1234");
        }catch(Exception e){
            System.out.println("error thrown as expected "+ e);
        }

        hub.registerStudent("bob", "null", "null@gmail.com");

        try{
            hub.loginStudent("bob", "1234");
        }catch(Exception e){
            System.out.println("error thrown as expected "+ e);
        }
    }

    public void testDoesStudentExist(){
        try {
             hub.doesStudentExist("bob");
        } catch (Exception e) {
            System.out.println("error thrown as expected " + e);
        }
       
    }
    public void testRegisterStudent(){
        try{
        hub.registerStudent("bobina", "bob123", "null");
        }catch(Exception e){
            System.out.println("error throw as expected " + e);
        }
    }

    public void testStudentClass(){
        try{
            new Student("Null@nullington.com", "lilnully", "Null@nullington.com");
        }catch(Exception e){
            System.out.println("exception thrown as expected " + e);
        }
    }

    public void testChangeName(){
        Student nullStudent = new Student("null", "mr.gobby", "gob@gmail.com");
        try {
            nullStudent.changeName("");
        } catch (Exception e) {
            System.out.println("exception thrown as expected "+e);
        }
        try {
            gob.changeName("bob@bob");
        } catch (Exception e) {
            System.out.println("exception thrown as expected "+e);
        }
    }
    

    public void testSubmitAssignment(){
        try {
            Student nullStudent = new Student(null, "mr.gobby", "gob@gmail.com");
            
        } catch (Exception e) {
            System.out.println("exception thrown as expected "+e);
        }
    }
    
}
