package br.com.casadocodigo.twittersearch.receiver;

import br.com.casadocodigo.twittersearch.service.NotificacaoService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StartupReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent it = new Intent(context, NotificacaoService.class);
		context.startService(it);
		
	}

}
