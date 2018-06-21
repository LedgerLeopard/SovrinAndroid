package com.ledgerleopard.sorvin.functionality.actions;

import android.content.Context;
import android.content.Intent;

import com.ledgerleopard.sorvin.R;
import com.ledgerleopard.sorvin.basemvp.BaseActivity;
import com.ledgerleopard.sorvin.functionality.addconnection.PresenterStub;
import com.ledgerleopard.sorvin.functionality.attestation.AttestationActivity;
import com.ledgerleopard.sorvin.functionality.connections.ConnectionsViewImpl;
import com.ledgerleopard.sorvin.functionality.pool.PoolListActivity;

public class ActionsActivity extends BaseActivity<PresenterStub> {

    public static void start( Context context){
        context.startActivity( new Intent(context, ActionsActivity.class) );
    }

    @Override
    protected void initUI() {
        setToolbarTitle("Actions");
        setContentView(R.layout.activity_actions);

        findViewById(R.id.btnPool).setOnClickListener(view -> PoolListActivity.start(ActionsActivity.this));
        findViewById(R.id.btnConnections).setOnClickListener(view -> ConnectionsViewImpl.start(ActionsActivity.this));
        findViewById(R.id.btnAttestation).setOnClickListener(view -> AttestationActivity.start(ActionsActivity.this));
    }

    @Override
    protected void initBack() {
        presenter = new PresenterStub(null, null);
    }
}