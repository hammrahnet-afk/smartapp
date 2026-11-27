package ir.cmbtools.ledger

import ir.cmbtools.ledger.sms.cardMatchIsAmbiguous
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class CardMatchRulesTest {
    @Test
    fun only_multiple_customers_are_ambiguous() {
        assertFalse(cardMatchIsAmbiguous(0))
        assertFalse(cardMatchIsAmbiguous(1))
        assertTrue(cardMatchIsAmbiguous(2))
        assertTrue(cardMatchIsAmbiguous(3))
    }
}
