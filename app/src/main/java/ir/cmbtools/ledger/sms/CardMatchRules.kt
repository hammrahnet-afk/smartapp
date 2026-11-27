package ir.cmbtools.ledger.sms

/** Four card digits are only usable for automatic matching when they identify one customer. */
internal fun cardMatchIsAmbiguous(customerCount: Int): Boolean = customerCount > 1
