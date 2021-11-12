public class MVCPatternDemo {
   public static void main(String[] args) {

      KjvAdvList model  = retriveListFromDatabase();

      ListView view = new ListView();

      ListController controller = new ListController(model, view);

      controller.updateView();

      //update model data
      controller.setValue(133);

      controller.updateView();
   }

   private static KjvAdvList retriveListFromDatabase(){
      KjvAdvList list = new KjvAdvList();
      list.add(3);
      list.add(13);
      list.add(4);
      list.add(5);
      return list;
   }
}