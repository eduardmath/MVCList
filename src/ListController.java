public class ListController {
    private KjvAdvList model;
    private ListView view;
 
    public ListController(KjvAdvList model, ListView view){
       this.model = model;
       this.view = view;
    }
 
    public void setValue(Integer x){
       model.add(x);	
    }
 
    public Integer getValue(){
       return model.last.item;		
    }
 
    public void updateView(){				
       view.printValueList(model);
    }	
 }