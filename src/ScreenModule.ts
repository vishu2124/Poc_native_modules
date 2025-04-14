import { TurboModule, TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  navigateToScreen(screenName: string): Promise<string>;
}

export default TurboModuleRegistry.getEnforcing<Spec>('ScreenModule'); 