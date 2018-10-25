package com.bignerdranch.android.MyReceipts.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.bignerdranch.android.MyReceipts.Receipt;

import java.util.Date;
import java.util.UUID;

public class ReceiptCursorWrapper extends CursorWrapper {
    public ReceiptCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Receipt getReceipt() {
        String uuidString = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.UUID));
        String title = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.TITLE));
        String shop = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.SHOP));
        String comment = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.COMMENT));
        long date = getLong(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.DATE));
        String suspect = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.SUSPECT));

        Receipt receipt = new Receipt(UUID.fromString(uuidString));
        receipt.setTitle(title);
        receipt.setShop(shop);
        receipt.setComment(comment);
        receipt.setDate(new Date(date));
        receipt.setSuspect(suspect);

        return receipt;

    }

}

