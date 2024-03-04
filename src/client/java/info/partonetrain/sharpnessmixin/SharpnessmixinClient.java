package info.partonetrain.sharpnessmixin;

import net.fabricmc.api.ClientModInitializer;

public class SharpnessmixinClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Sharpnessmixin.LOGGER.info("SharpnessMixin is installed! Sharpness enchantment will have no effect on the Attack Damage tooltip.");
	}
}