import java.math.BigDecimal;
import java.util.UUID;

import forge_abi.Rpc;
import io.arcblock.forge.Result;
import io.arcblock.forge.did.WalletInfo;
import io.arcblock.forge.extension.BigIntegerExtKt;

/**
 * █████╗ ██████╗  ██████╗██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
 * ██╔══██╗██╔══██╗██╔════╝██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
 * ███████║██████╔╝██║     ██████╔╝██║     ██║   ██║██║     █████╔╝
 * ██╔══██║██╔══██╗██║     ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
 * ██║  ██║██║  ██║╚██████╗██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
 * ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝
 * Author       : shan@arcblock.io
 * Time         : 2019-11-29
 * Edited By    :
 * Edited Time  :
 * Description  :
 **/
class Exchange extends BaseConfig{
  public static void main(String[] args){

    Rpc.ResponseSendTx response;


    WalletInfo alice = forge.createWallet();
    response=forge.declare("Alice", alice);
    WalletInfo Thomas = forge.createWallet();
    response=forge.declare("Thomas", Thomas);

    forge.checkin(alice);

    waitForBlockCommit();
    printAccountBalance(alice.getAddress());

    //create Asset for Thomas
    Result result = forge.createAsset("json",("{\"a\":"+ UUID.randomUUID().toString() +"}").getBytes(), "testAsset", Thomas);
    response = result.getResponse();//create asset transaction response
    String assetAddress = result.getAddress();

    waitForBlockCommit();
    printAccountBalance(Thomas.getAddress());

    //simple exchange
    response = forge.exchange(alice, Thomas, BigIntegerExtKt.unSign(new BigDecimal("10E18").toBigInteger()), assetAddress);
    logger.info(response.toString());

    waitForBlockCommit();
    printAccountBalance(alice.getAddress());
    printAccountBalance(Thomas.getAddress());


  }
}
