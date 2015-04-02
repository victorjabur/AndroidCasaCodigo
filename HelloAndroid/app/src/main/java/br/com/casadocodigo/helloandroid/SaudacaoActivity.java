package br.com.casadocodigo.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SaudacaoActivity extends Activity {

    public static final String EXTRA_NOME_USUARIO = "helloandroid.EXTRA_NOME_USUARIO";

    public static final String ACAO_EXIBIR_SAUDACAO = "helloandroid.ACAO_EXIBIR_SAUDACAO";
    public static final String CATEGORIA_SAUDACAO = "helloandroid.CATEGORIA_SAUDACAO";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saudacao);
        TextView saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);
        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_NOME_USUARIO)) {
            String saudacao = getResources().getString(R.string.saudacao);
            saudacaoTextView.setText(saudacao + " " + intent.getStringExtra(EXTRA_NOME_USUARIO));
        } else {
            saudacaoTextView.setText("O nome do usuário não foi informado");
        }
    }
}
