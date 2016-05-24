/**
 * Created by guillaumelours on 9/24/15.
 */
package entites.visitor;

import entites.EmailChannel;
import entites.FaxChannel;

public interface ChannelVisitor<T> {
    T visit(EmailChannel emailChannel);
    T visit(FaxChannel faxChannel);

}
