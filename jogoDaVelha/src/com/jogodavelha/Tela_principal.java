package com.jogodavelha;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela_principal extends Activity {

	private Button btnl1;
	private Button btnl2;
	private Button btnl3;
	private Button btnl4;
	private Button btnl5;
	private Button btnl6;
	private Button btnl7;
	private Button btnl8;
	private Button btnl9;
	private Button btnRecomecar;
	private Button btnFechar;
	private TextView vez;
	private int i;
	private boolean winer ;
	

	
	public void recomecar(){
		btnl1.setEnabled(true);
		btnl2.setEnabled(true);
		btnl3.setEnabled(true);
		btnl4.setEnabled(true);
		btnl5.setEnabled(true);
		btnl6.setEnabled(true);
		btnl7.setEnabled(true);
		btnl8.setEnabled(true);
		btnl9.setEnabled(true);
		
		 btnl1.setText("");
		 btnl2.setText("");
		 btnl3.setText("");
		 btnl4.setText("");
		 btnl5.setText("");
		 btnl6.setText("");
		 btnl7.setText("");
		 btnl8.setText("");
		 btnl9.setText("");
		 i=0;
		
	}
	
	public void testeVez1(){
		if (btnl1.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{
				vez.setText("player 1 jogou");
				btnl1.setText("X");
				jogador1Venceu();
				
				
				
			}
			else 
			{
				vez.setText("player 2 jogou");
				btnl1.setText("O");
				jogador2Venceu();
			
		
			}
		}
	}
		
	public void testeVez2(){
		if (btnl2.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{
				vez.setText("player 1 jogou");
				btnl2.setText("X");
				jogador1Venceu();
				
			}
			else 
			{
				vez.setText("player 2 jogou");
				btnl2.setText("O");
				jogador2Venceu();
				
			}
		}
	}
	
	public void testeVez3(){
		if (btnl3.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{
				vez.setText("player 1 jogou");
				btnl3.setText("X");
				jogador1Venceu();
				
			}
			else 
			{
				vez.setText("player 2 jogou");
				btnl3.setText("O");
				jogador2Venceu();
				
			}
		}
	}
	
	public void testeVez4(){
		if (btnl4.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{
				vez.setText("player 1 jogou");
				btnl4.setText("X");
				jogador1Venceu();
				
			}
			else 
			{
				vez.setText("player 2 jogou");
				btnl4.setText("O");
				jogador2Venceu();
				
			}
		}
	}
	
	public void testeVez5(){
		if (btnl5.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{
				vez.setText("player 1 jogou");
				btnl5.setText("X");
				jogador1Venceu();
				
			}
			else 
			{
				vez.setText("player 2 jogou");
				btnl5.setText("O");
				jogador2Venceu();
				
			}
		}
	}
	
	public void testeVez6(){
		if (btnl6.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{
				vez.setText("player 1 jogou");
				btnl6.setText("X");
				jogador1Venceu();
				
			}
			else 
			{
				vez.setText("player 2");
				btnl6.setText("O");
				jogador2Venceu();
				
			}
		}
	}
	
	public void testeVez7(){
		if (btnl7.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{
				vez.setText("player 1 jogou");
				btnl7.setText("X");
				jogador1Venceu();
				
			}
			else 
			{
				vez.setText("player 2 jogou");
				btnl7.setText("O");
				jogador2Venceu();
			
			}
		}
	}
	
	public void testeVez8(){
		if (btnl8.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{
				vez.setText("player 1 jogou");
				btnl8.setText("X");
				jogador1Venceu();
				
			}
			else 
			{
				vez.setText("player 2 jogou");
				btnl8.setText("O");
				jogador2Venceu();
				
			}
		}
	}
	
	public void testeVez9(){
		if (btnl9.getText().equals(""))			
		{
			i++;
			if (i==1 || i==3 || i==5 || i==7 || i==9)
			{	
				vez.setText("player 1 jogou");
				btnl9.setText("X");
				jogador1Venceu();
				empate(i);
			}
			else 
			{
				vez.setText("player 2 jogou");
				btnl9.setText("O");
				jogador2Venceu();
				empate(i);
			}
		}
	}
	
    private boolean jogador1Venceu() {
		// TODO Auto-generated method stub
    	
    	if(btnl1.getText()=="X" && btnl2.getText()=="X" && btnl3.getText()=="X" ){
    		winer = true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
    	else if(btnl1.getText()=="X" && btnl4.getText()=="X" && btnl7.getText()=="X"){
    		winer = true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
    	else if(btnl4.getText() =="X" && btnl5.getText() == "X" && btnl6.getText() =="X"){
    		winer = true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
    	else if(btnl7.getText() =="X" && btnl8.getText() == "X" && btnl9.getText() =="X"){
    		winer = true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
    	else if(btnl2.getText() =="X" && btnl5.getText() == "X" && btnl8.getText() =="X"){
    		winer = true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
    	else if(btnl3.getText() =="X" && btnl6.getText() == "X" && btnl9.getText() =="X"){
    		winer= true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
    	else if(btnl4.getText() =="X" && btnl5.getText() == "X" && btnl6.getText() =="X"){
    		winer = true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
    	else if(btnl1.getText() =="X" && btnl5.getText() == "X" && btnl9.getText() =="X"){
    		winer= true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
    	else if(btnl3.getText() =="X" && btnl5.getText() == "X" && btnl7.getText() =="X"){
    		winer = true;
    		block();
    		vez.setText("jogador 'X' ganhou ");
    	}
		return winer;
	}

	private boolean jogador2Venceu() {
		// TODO Auto-generated method stub
    	
    	if(btnl1.getText()=="O" && btnl2.getText()=="O" && btnl3.getText()=="O" ){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	
    	else if(btnl1.getText()=="O" && btnl4.getText()=="O" && btnl7.getText()=="O"){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	else if(btnl4.getText() =="O" && btnl5.getText() == "O" && btnl6.getText() =="O"){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	else if(btnl7.getText() =="O" && btnl8.getText() == "O" && btnl9.getText() =="O"){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	else if(btnl2.getText() =="O" && btnl5.getText() == "O" && btnl8.getText() =="O"){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	else if(btnl3.getText() =="O" && btnl6.getText() == "O" && btnl9.getText() =="O"){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	else if(btnl4.getText() =="O" && btnl5.getText() == "O" && btnl6.getText() =="O"){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	else if(btnl1.getText() =="O" && btnl5.getText() == "O" && btnl9.getText() =="O"){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	else if(btnl3.getText() =="O" && btnl5.getText() == "O" && btnl7.getText() =="O"){
    		winer = true;
    		block();
    		vez.setText("jogador 'O' ganhou ");
    	}
    	
		return winer;
	}
	
	public void block(){
		btnl1.setEnabled(false);
		btnl2.setEnabled(false);
		btnl3.setEnabled(false);
		btnl4.setEnabled(false);
		btnl5.setEnabled(false);
		btnl6.setEnabled(false);
		btnl7.setEnabled(false);
		btnl8.setEnabled(false);
		btnl9.setEnabled(false);
	}

	
	
	public void empate(int i){
		
		if(i==9 &&  winer!=true){
			vez.setText("EMPATE !");
		}
	}

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        btnl1 = (Button)findViewById(R.id.l1);
        btnl2 = (Button)findViewById(R.id.l2);
        btnl3 = (Button)findViewById(R.id.l3);
        btnl4 = (Button)findViewById(R.id.l4);
        btnl5 = (Button)findViewById(R.id.l5);
        btnl6 = (Button)findViewById(R.id.l6);
        btnl7 = (Button)findViewById(R.id.l7);
        btnl8 = (Button)findViewById(R.id.l8);
        btnl9 = (Button)findViewById(R.id.l9);
        btnRecomecar = (Button)findViewById(R.id.recomecar);
        btnFechar = (Button)findViewById(R.id.fechar);
    	vez = (TextView)findViewById(R.id.vez);
    
        
        btnRecomecar.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				recomecar();	
			}
        	
        	
        });
        
        btnl1.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			testeVez1();
			}
		});       
        
        btnl2.setOnClickListener(new View.OnClickListener(){
			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 			testeVez2();
 			}
 		});       
         
 
        btnl3.setOnClickListener(new View.OnClickListener(){
			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 			testeVez3();
 			}
 		});       
         
        
        btnl4.setOnClickListener(new View.OnClickListener(){
			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 			testeVez4();
 			}
 		});       
         
        btnl5.setOnClickListener(new View.OnClickListener(){
			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 			testeVez5();
 			}
 		});       
         
        btnl6.setOnClickListener(new View.OnClickListener(){
			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 			testeVez6();
 			}
 		});       
         
        btnl7.setOnClickListener(new View.OnClickListener(){
			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 			testeVez7();
 			}
 		});       
         
        btnl8.setOnClickListener(new View.OnClickListener(){
			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 			testeVez8();
 			}
 		});       
         
        btnl9.setOnClickListener(new View.OnClickListener(){
			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 			testeVez9();
 			}
 		});       
         
        
        
 btnFechar.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Tela_principal.this.finish();
			}
		});       
        
 }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela_principal, menu);
        return true;
    }
    
}
