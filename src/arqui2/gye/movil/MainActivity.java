package arqui2.gye.movil;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void IniciarSesion(View boton){
    	boolean pasa=true;
    	TextView txtuser = (TextView)findViewById(R.id.txtUsuario_Login);
    	TextView txtpass = (TextView)findViewById(R.id.txtPass_Login);
    	String usuario="",pass="";
    	try{
    		usuario=txtuser.getText().toString();
    		pass=txtpass.getText().toString();
    		if(pasa){
    			Intent intent=new Intent();
    			intent.setClass(this, MenuPrincipal.class);
    			startActivity(intent);
    		}
    	}catch(Exception ex){
    		Toast.makeText(this, "los campos no pueden estar vacios", Toast.LENGTH_SHORT);
    	}	
    }
    public void IrRegistro(View boton){
    	Intent intent=new Intent();
		intent.setClass(this, registro.class);
		startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
