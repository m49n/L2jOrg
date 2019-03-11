package org.l2j.gameserver.network.serverpackets;

import org.l2j.gameserver.model.actor.instance.L2PcInstance;
import org.l2j.gameserver.model.items.instance.L2ItemInstance;
import org.l2j.gameserver.network.L2GameClient;
import org.l2j.gameserver.network.OutgoingPackets;
import org.l2j.gameserver.model.items.type.CrystalType;

import java.nio.ByteBuffer;
import java.util.Collection;

public class ExShowBaseAttributeCancelWindow extends IClientOutgoingPacket {
    private final Collection<L2ItemInstance> _items;
    private long _price;

    public ExShowBaseAttributeCancelWindow(L2PcInstance player) {
        _items = player.getInventory().getItems(L2ItemInstance::hasAttributes);
    }

    @Override
    public void writeImpl(L2GameClient client, ByteBuffer packet) {
        OutgoingPackets.EX_SHOW_BASE_ATTRIBUTE_CANCEL_WINDOW.writeId(packet);

        packet.putInt(_items.size());
        for (L2ItemInstance item : _items) {
            packet.putInt(item.getObjectId());
            packet.putLong(getPrice(item));
        }
    }

    /**
     * TODO: Unhardcode! Update prices for Top/Mid/Low S80/S84
     *
     * @param item
     * @return
     */
    private long getPrice(L2ItemInstance item) {
        switch (item.getItem().getCrystalType()) {
            case CrystalType.S: {
                if (item.isWeapon()) {
                    _price = 50000;
                } else {
                    _price = 40000;
                }
                break;
            }
            case CrystalType.S80: {
                if (item.isWeapon()) {
                    _price = 100000;
                } else {
                    _price = 80000;
                }
                break;
            }
            case CrystalType.S84: {
                if (item.isWeapon()) {
                    _price = 200000;
                } else {
                    _price = 160000;
                }
                break;
            }
        }

        return _price;
    }
}
